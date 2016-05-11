**Create Modules using mvn archtype**
mvn archetype:generate -DgroupId=dar.osgi.usersearch -DartifactId=usersearch-dbconnection

**Install feature.xml in Karaf**
feature:repo-add mvn:dar.osgi.usersearch/usersearch-features/1.0-SNAPSHOT/xml

**Install Bundles in Karaf**
feature:install usersearch-userservice usersearch-ui usersearch-usermodel usersearch-dbconnection 
usersearch-userpersistence