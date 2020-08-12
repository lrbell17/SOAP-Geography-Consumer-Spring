# SOAP-Geography-Consumer-Spring

A Spring Boot REST application that consumes SOAP-Geography-Web-Service, which is a SOAP web service as seen here: https://github.com/lrbell17/SOAP-Geography-Web-Service

This program uses uses WebServiceTemplate and Jaxb2Marshaller to send an xml based SOAP request and get a response as a Java object.

To execute, make sure both SOAP-Geography-Web-Service and SOAP-Geography-Consumer-Spring are running, and enter the url: http://localhost:8889/getState/California
(try with different states)


