import java.math.BigInteger;
import java.util.Random;

/**
  The class RSA will generate two distinct prime numbers, find the value
  of Carmichael's Totient using those two primes, generate a public and private
  key for encryption, and will allow for the encryption and decryption of
  an integer.
*/
public class RSA
{
  // If use Math.random() to generate random prime BigInteger,
  // causes an error; must use Random class object
  private Random random = new Random();
  // Two distinct prime numbers to be used for key generation
  private BigInteger prime1p;
  private BigInteger prime2q;
  // Public key
  private BigInteger e;
  // Private key
  private BigInteger d;
  // Product of prime1p and prime2q
  private BigInteger n;
  // Carmichael's Totient
  private BigInteger cmt;
  // Greatest Common Divisor
  private BigInteger gcd;
  // BigInteger value of 1 to be used for comparisons and operations with other
  // BigIntegers.
  private BigInteger one;
  // Will be used during the encryption/decryption process.
  private BigInteger value;
  // Will be used during the getPublicKey method.
  private BigInteger rand;

  /**
    Zero-argument constructor initializes variables needed to Generate
    public and private keys for encryption. Also finds the value of
    Carmichael's Totient for two generated prime numbers.
  */
  public RSA()
  {
    // Generate the two prime numbers
    this.prime1p = new BigInteger(256, 256, this.random);
    this.prime2q = new BigInteger(256, 256, this.random);
    // Make sure prime1p and prime2q are distinct
    while (this.prime1p == this.prime2q)
    {
      this.prime2q = BigInteger.probablePrime(256, this.random);
    }
    //this.prime1p = new BigInteger(20 + "");
    //this.prime2q = new BigInteger(17 + "");

    // Initializes the value of cmt
    this.cmt = new BigInteger(0 +"");
    this.n = this.prime1p.multiply(this.prime2q);

    // BigInteger one will allow subtraction of BigIntegers and 'integer' 1
    this.one = new BigInteger(1 + "");

    // pHolder and qHolder will allow the lcd of prime1p - 1 and prime2q - 1 to
    // be found.
    BigInteger pHolder = new BigInteger((this.prime1p.subtract(one))+"");
    BigInteger qHolder = new BigInteger((this.prime2q.subtract(one)) + "");

    // Find Greatest Common Divisor of p-1 and q-1 for
    // ease of calculation regarding Carmichael's totient
    this.gcd = pHolder.gcd(qHolder);

    // Find the value of Carmichael's Totient by using the generated primes
    this.cmt = (pHolder.multiply(qHolder)).divide(gcd);
  }

  /**
    Returns the 1st prime number generated
    @return the prime number designated as 'p'
  */
  public BigInteger getPrime1()
  {
    return this.prime1p;
  }

  /**
    Returns the 2nd prime number generated
    @return the prime number designated as 'q'
  */
  public BigInteger getPrime2()
  {
    return this.prime2q;
  }

  /**
    Returns the value calculated in Carnmichael's Totient with the two prime numbers.'
    @return the value in Carmichael's Totient.
  */
  public BigInteger getTotient()
  {
    return this.cmt;
  }

  /**
    Generates a public key to be used for encryption.
    @return the public key number.
  */
  public BigInteger getPublicKey()
  {
    
    while(true)
    {
	  //Will generate random BigIntegers until it finds one that is less than cmt and coprime to cmt
	  this.rand = new BigInteger(512, this.random);
	  while(this.rand.compareTo(this.cmt) == 1)
	  {
		  this.rand = new BigInteger(512, this.random);
	  }
      this.e = new BigInteger(rand + "");

      if(this.cmt.gcd(this.e).compareTo(this.one) == 0)
      {
          break;
      }
    }

    return this.e;
  }

  /**
    Generates a private key to be used for decryption.
    @return the private key number.
  */
  public BigInteger getPrivateKey()
  {
    // Initialize private key
    this.d = new BigInteger(0+"");
    // Set Private Key's true value using this.e
    this.d = this.e.modInverse(this.cmt);
    return this.d;
  }

  /**
    Encrypts the value inserted. @param toEncrypt is the value to encrypt.
    @return the encrypted number.
  */
  public BigInteger encrypt(int toEncrypt)
  {
    BigInteger encrypting = new BigInteger(toEncrypt +"");
    BigInteger encryptedValue = encrypting.modPow(this.e, this.n);
    this.value = new BigInteger(encryptedValue + "");
    return this.value;
  }

  /**
    Decrypts the value that was previously encrypted.
    @return the decrypted value.
  */
  public BigInteger decrypt()
  {
    BigInteger decryptedValue = this.value.modPow(this.d, this.n);
    return decryptedValue;
  }
}
