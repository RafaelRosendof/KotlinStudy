// testando funcionalidades 

/* 
fun max(a : Int , b: Int) : Int {
    return if (a > b) a else b
}

fun min (a : Int , b: Int) : Int = if (a < b) a else b 

fun max2(a: Int , b: Int) = if (a > b) a else b

fun mul(a : Int , b: Int) : Int{
    var c = a * b;
    return c;
}

fun Str(a : String , b: Array<String>) : Array<String>{

    return b.add(a);
}

fun preenche(b: Array<String>) : Array<String>{

    for (i in b.indices){
        println("Digite o nome da pessoa: ");
        val a = readLine() ?: "";
        b[i] = a;
    }

    return b;
}

fun printa(b: Array<String>): {
    

    for (i in b.indices){
        println("Hello , ${if (b[i] != null) b[i] else "World"}");
    }
}

// for loops 
fun matrixMulti(matA : Array<Array<Int>> , matB : Array<Array<Int>>) : Array<Array<Int>>{
    var matC = Array(matA.size){Array(matB[0].size){0}};

    for (i in matA.indices){
        for (j in matB[0].indices){
            for (k in matB.indices){
                matC[i][j] += matA[i][k] * matB[k][j];
            }
        }
    }

    return matC;

    
}
*/

fun <T , R> map(a : List<T> , f: (T) -> R) : List<R>{

    //base case
    if(a.isEmpty()) return emptyList();

    val head = f(a[0]) 

    return listOf(head) + map(a.drop(1) , f)
}

fun main(){
    val arr = listOf(1,2,3,4,5,6,7,8,9,10 , 11 , 12 , 13 , 14 , 15 , 16 , 17 , 18 , 19 , 20);

    val quads = map(arr) {x -> x * x};

    println(quads.joinToString());

    val arre = arrayOf(1,2,3,4,5,6,7,8,9,10);

    for (i in arre.indices){
        println(arr[i] * 2);
    }

    println("\n\n");

    for (i in 1..10){
        println(i);
    }

    println("\n\n");

    for (i in 100 downTo 1 step 2){
        println(i);
    }

    
}

