/**
 * Created by Saravana on 5/2/15.
 */
class Basic {

    def commonField
    def notSoCommonField

    public static void main(def args){

        // Println
        new Basic().printAll()

        // Data type and variables
//        new Basic().dataTypeVariables()

        // Method call
//        new Basic().callMethod("E","O","N")
//        new Basic().callMethod "O","N","E"
//        println(new Basic().callMethod('T','W','O'))

        // Array and List and Map
//        new Basic().arrayListMap()

        // loop
//        new Basic().loopScenario()

        // Dynamic string
//        new Basic().dynamicString()

        // Getter and Setter. Accessing variables
        // Refer Medium.groovy
    }

    def dynamicString() {
        def question = 'what is your name?'
        def name = 'Henry'
        def answer = "My name is $name. What is yours?"
        println question
        println answer
    }

    def loopScenario() {

        for(i in 0..40){
            print i
        }
        println()
        for(i in 0..<40){
            print i
        }
        println()
        40.times{
            print it
        }
        println()
        (4..49).each{
            print it
        }
        println()
    }

    void arrayListMap() {

        // Array
        int[] integers = [1,2,3,4,5,6,7]
        println integers

        // List
        def sampleList = [1,2,3,4,5,6,"One"]
        sampleList.add("rfr")
        sampleList.remove("One")
        sampleList<<89
        sampleList-2
        sampleList.removeAll{it==4}
        println sampleList

        // Map
        def map = [:] // Empty map
        map.put("One",1)
        map.put("Two",2)
        map.put(3,"Three")
        map[7] = "Seven"
        println map



    }

    def callMethod(a, b, c) {
        println a + b + c // Concatenate
        return a<<b<<c // Concatenate efficiently
    }


    def dataTypeVariables() {

        def i = 0
        println i

        i = "what"
        println i

        def number = "345"
        println number * 4
        println number.toInteger() * 4

        number = "Romeo"
        // Exception will occur
        //println number.toInteger()


    }

    def printAll(){
        println "One"
        println("Two")

        println "-"*20
    }


    def getCommonField(){
        return commonField + " : HaHa"
    }
}
