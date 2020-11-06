#!/bin/sh

echo "Starting docker-test ... "

#sed -ire "s~params.param1=Parameter1~params.param1=${PARAMETER1}~" /var/application.properties
#sed -ire "s~params.param2=Parameter2~params.param2=${PARAMETER2}~" /var/application.properties

#echo "= TEST config =================================================="
#cat /var/application.properties
#echo "= End of TEST config ==========================================="

#java -jar /var/app.jar --spring.config.location=/var/application.properties

java -jar /var/app.jar --spring.config.location=/configdst/application.properties
