package examen1_claudiacortes;

public class CifradoTrans {
    public static String TxT,Seed;
public static String Charset = "abcdefghijklmnopqrstuvwxyz";

public CifradoTrans(String TxT,String Seed){
this.Seed = Desn(Seed);
this.TxT = TxT;
}
public static String Cifrar(){
String Cifrado = "",a=TxT.toLowerCase();
for(int n = 0,c=0;n<TxT.length();n++,c = (c+1)%Seed.length()){
if(Charset.indexOf(a.charAt(n))!=-1){
int tmp = (Charset.indexOf(a.charAt(n))+Charset.indexOf(Seed.charAt(c)))%Charset.length();
Cifrado+=(Charset.indexOf(TxT.charAt(n))!=-1)?Charset.charAt(tmp):String.valueOf(Charset.charAt(tmp)).toUpperCase();
}else{
c-=1;
Cifrado+=TxT.charAt(n);
}
}
return Cifrado;
}
public static String DesCifrar(){
    
String DesCifrado = "";
String a = TxT.toLowerCase();
for(int n = 0,c=0;n<a.length();n++,c=(c+1)%Seed.length()){
if(Charset.indexOf(a.charAt(n))!=-1){
int tmp = (Charset.indexOf(a.charAt(n))-Charset.indexOf(Seed.charAt(c)));
tmp = (tmp<0)?(tmp+Charset.length()):tmp;
DesCifrado+=(Charset.indexOf(TxT.charAt(n))!=-1)?Charset.charAt(tmp):String.valueOf(Charset.charAt(tmp)).toUpperCase();
}else{
c-=1;
DesCifrado+=TxT.charAt(n);
}
}
return DesCifrado;
}

    public static String getTxT() {
        return TxT;
    }

    public static void setTxT(String TxT) {
        CifradoTrans.TxT = TxT;
    }

    public static String getSeed() {
        return Seed;
    }

    public static void setSeed(String Seed) {
        CifradoTrans.Seed = Seed;
    }

    public static String getCharset() {
        return Charset;
    }

    public static void setCharset(String Charset) {
        CifradoTrans.Charset = Charset;
    }

public static String Desn(String a){
String b = "";
for(int n = 0;n<a.length();n++){
if((Charset.indexOf(a.charAt(n))!=-1)||(Charset.indexOf(String.valueOf(a.charAt(n)).toLowerCase())!=-1))
b+=a.charAt(n);
}
return b;
}

    CifradoTrans() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
