// Well, Groovy uses Regex by strange way

println "potatoe" ==~ /potatoe/

println "potato" ==~ /potatoe?/

println "potatoe" ==~ /potatoe?/


checkSpelling = {attempt, correct ->
    
    if (attempt ==~ correct)
        println "Congratulations, you spelled \"$attempt\" correctly";
    else
        println "Sorry, try again";

}

corr = /Wisniewski/

checkSpelling("Wisniewski", corr);
checkSpelling("Wisnewski", corr);


// Capturing regex Groups...


localData = 'Liverpool, England: 53 25 0 N 3 0 0';

regex = /(\w+), (\w+): (\d+) (\d+) (\d+) (\w) (\d+) (\d+) (\d+)/;

matcher = localData =~ regex;

if (matcher.matches()) {
    println matcher.count + " ocurrence of the regular expression was found in the string.";
    println matcher[0][1] + " is in  the " + matcher[0][6] + " hemisphere. (According to " + matcher[0][0] + ")";
}


// Non-matching Groups....

names = [ "Graham James Edward Miller", "Andrew Gregory Macintyre"]

printClosure = {
    matcher = (it =~ /(.*?)(?: .+)+ (.*)/);
    if (matcher.matches())
        println matcher[0][2] + ", " + matcher[0][1];
}

names.each printClosure
