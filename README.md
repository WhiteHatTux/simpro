# simpro
This is a minimal repository to demonstrate the zanata-maven-plugin

### General setup
It is configured by the zanata.ini and zanata.xml
The zanata.ini is copied directly from the settings in the zanata server.
This file should probably not reside in the repository, but should be kept in the user directory.
(Obviously changing the pom.xml path to zanata.ini)
Whereas the zanata.xml is created in this repository to make sure the corresponding zanata server is spoken to correctly.

### Command
To push the messages.properties to zanata server use:

`mvn zanata:push`

Languages are configured in the server and all the localizations are then downloaded into the resources-directory with
the correct internationalization at the end using the command:

`mvn zanata:pull`
