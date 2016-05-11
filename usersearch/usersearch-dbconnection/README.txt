**Install ojdbc jar**
mvn install:install-file -Dfile={Path/to/your/ojdbc.jar} -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11 -Dpackaging=jar

**Install in Karaf**
install -s wrap:mvn:com.oracle/ojdbc6/11