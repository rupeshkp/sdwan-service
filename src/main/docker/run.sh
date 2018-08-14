#!/bin/sh
echo "********************************************************"
echo "Starting SDWAN-SERVICE Server"
echo "********************************************************"
java -jar /tmp/sdwan-service/@project.build.finalName@.jar
