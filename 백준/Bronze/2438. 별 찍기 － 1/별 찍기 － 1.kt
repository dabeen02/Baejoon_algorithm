fun main() = with(System.`in`.bufferedReader()){
    val num = readLine().toInt()
    val sb = StringBuilder()
    
    for(i in 1 .. num){
        for (j in 1..i){
            sb.append("*")
        }
        sb.append("\n")
    }
    print("$sb")
}