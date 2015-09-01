# simpro
This is a minimal repository to demonstrate the [zanata-maven-plugin](https://github.com/zanata/zanata-client/tree/master/zanata-maven-plugin)

**Note! This plugin currently only works on linux**

### General setup
It is configured by the zanata.ini and zanata.xml and the corresponding section in maven pom.xml

The zanata.ini is copied directly from the profile > settings section in the zanata server.

zanata.ini should probably not reside in the repository, but should be kept in the user directory.

Whereas the zanata.xml is created in this repository to make sure the configuration of zanta remains consistent everywhere.
By now the only remaining configuration in zanata.xml is the project, because including this in the pom.xml conflicts with 
the maven element "project"

### Commands 
To push the messages.properties to zanata server use:

`mvn zanata:push`

Languages are configured in the server and all the localizations are then downloaded into the resources-directory with
the correct internationalization at the end using the command:

`mvn zanata:pull`
