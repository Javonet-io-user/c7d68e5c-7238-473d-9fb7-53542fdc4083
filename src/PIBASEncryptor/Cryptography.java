package PIBASEncryptor;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import PIBASEncryptor.*;

public class Cryptography {
  protected NObject javonetHandle;

  public Cryptography() {
    try {
      javonetHandle = Javonet.New("PIBASEncryptor.Cryptography");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Cryptography(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String GetEncryptedURI(
      java.lang.String PublicKey, java.lang.String QueryString) {
    try {
      java.lang.String res =
          Javonet.getType("PIBASEncryptor.Cryptography")
              .invoke("GetEncryptedURI", PublicKey, QueryString);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String GetToken() {
    try {
      java.lang.String res = Javonet.getType("PIBASEncryptor.Cryptography").invoke("GetToken");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
