// We are making a Closure...

square = { it * it}

// it indicates the parameter




[0,1,2,3,4,5,6].collect(square)



each = {k,v -> println "$k: $v"; k + v}

["a key":"A value","Another key":0].each(each)