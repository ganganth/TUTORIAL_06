object CeasarCipher extends App{

val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

//encription function
val Encryption=(c:Char,key:Int,a:String)=>
a((a.indexOf(c.toUpper)+key)%a.size)

//decription function
val Decryption=(c:Char,key:Int,a:String)=>
a((a.indexOf(c.toUpper)-key)%a.size)

//cipher function
val cipher=(algo:(Char,Int,String)=>
Char,s:String,key:Int,a:String)=>
s.map(algo(_,key,a))


//print
val input=scala.io.StdIn.readLine("Secret Message: ")
val key=scala.io.StdIn.readLine("number of shifting line: ").toInt
println(cipher(Encryption,input,key,alphabet))

val result=cipher(Encryption,input,key,alphabet)
println(cipher(Decryption,result,key,alphabet))


}