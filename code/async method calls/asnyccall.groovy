import groovyx.gpars.GParsPool

import java.util.concurrent.Future


GParsPool.withPool {
    println "Calling async function"
    Future longVal = {
        (1..25).collect {
            sleep 500
            it * 2
        }
    }.callAsync()
    println 'Async function called. Blocking on get call'
    println "val: ${longVal.get()}"
}
