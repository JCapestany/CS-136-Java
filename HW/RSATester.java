public class RSATester
{
  public static void main(String[] args)
  {
    RSA crypto = new RSA();
    int encrypt;

    System.out.println("P: "+ crypto.getPrime1());
    System.out.println("Q: "+ crypto.getPrime2());
    System.out.println("CMT: "+ crypto.getTotient());
    System.out.println("PubKey: " + crypto.getPublicKey());
    System.out.println("PrivKey: "+ crypto.getPrivateKey());
    System.out.println("Encrypted: "+ crypto.encrypt(65));
    System.out.println("Decrypted: "+ crypto.decrypt());
  }
}
