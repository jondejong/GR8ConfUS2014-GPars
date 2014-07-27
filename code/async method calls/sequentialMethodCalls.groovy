
def reallyLongProcessLoop(values) {
    values.collect {
        sleep 500
        it * 2
    }.each {
        print " ${it}"
    }

}

def quickProcessLoop(values) {
    values.collect {
        it * 2
    }.each {
        print " ${it}"
    }
}

println "Long process: "
def finalLongLoopValues = reallyLongProcessLoop(1..25)
println "Quick process: "
def finalQuickLoopValues = quickProcessLoop(26..50)
println "Those are done. We can do something else now"
