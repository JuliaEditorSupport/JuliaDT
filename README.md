# JuliaDT

Julia Development Toolkit for Eclipse

#Requirements

1. [Java 7+](http://www.oracle.com/technetwork/java/javase/overview/index.html)
2. [Maven  3.3.3+](https://maven.apache.org/)
3. [Julia](http://julialang.org/downloads/)


#To Build

    mvn clean install

#To Run 

    cd <project home>/com.juliacomputing.jldt.eclipse.repository/target/products
    cp jldt.product-<platform>.zip <installation directory>
    cd <installation directory>
    unzip jldt.product-<platform>.zip
    launch

#To Install

## As Eclipse plugin
    
    Update Site/Repository (url tbc)

## As Standalone Application    
    
    url tbc
  
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

    
 
