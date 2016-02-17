# JuliaDT [![Build Status](https://travis-ci.org/JuliaComputing/JuliaDT.svg?branch=master)](https://travis-ci.org/JuliaComputing/JuliaDT)

[Julia Development Toolkit for Eclipse](http://juliacomputing.com/blog/2016/02/06/Eclipse-JuliaDT.html)

#Requirements

1. [Java 7+](http://www.oracle.com/technetwork/java/javase/overview/index.html)
2. [Maven  3.3.3+](https://maven.apache.org/)
3. [Julia](http://julialang.org/downloads/)


#To Install as an Eclipse Plugin
   
Download the [alpha release](https://github.com/JuliaComputing/JuliaDT/releases/tag/v0.0.1) and follow installation instructions

> Plugin was tested using [Eclipse - Mars release](https://eclipse.org/mars/)

#Development

    git clone https://github.com/JuliaComputing/JuliaDT.git

##To Build

    mvn clean install

    mvn clean install -P strict

##To Run 

    cd <project home>/com.juliacomputing.jldt.eclipse.repository/target/products
    cp jldt.product-<platform>.zip <installation directory>
    cd <installation directory>
    unzip jldt.product-<platform>.zip
    launch

  
#To Do    
    
1. Extend support for Navigation and Outline
2. REPL support
3. Plotting Support
4. Incremental Execution

 
# References

1. [dltk](https://wiki.eclipse.org/DLTK)
2. [dltk.ruby](https://github.com/eclipse/dltk.ruby)
3. [dltk.javascrpt](https://github.com/eclipse/dltk.javascript)
4. [ANTLR](http://www.ANTLR.org)
5. [tycho](https://eclipse.org/tycho/)
6. [Checkstyle](http://eclipse-cs.sourceforge.net/#!/)
7. [Google Checkstyle Rules](https://github.com/checkstyle/checkstyle/blob/master/src/main/resources/google_checks.xml)
8. [Eclipse Source](https://git.eclipse.org/c/)
9. [dltk parent pom](https://git.eclipse.org/c/dltk/org.eclipse.dltk.releng.git/tree/build/pom.xml)
10. [Eclipse Common Build Infrastructure (CBI)](http://www.eclipse.org/community/eclipse_newsletter/2013/august/article3.php)
11. [Julia Parser](https://github.com/JuliaLang/JuliaParser.jl)
12. [PyDev](https://github.com/aptana/Pydev)

    
 
