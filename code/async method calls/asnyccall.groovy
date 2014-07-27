import groovyx.gpars.GParsPool

import java.util.concurrent.Future


GParsPool.withPool {
    Future longVal = {
        (1..25).collect {
            sleep 500
            it * 2
        }
    }.callAsync()

    println "val: ${longVal.get()}"
}
