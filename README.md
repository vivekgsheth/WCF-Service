# WCF-Service
Car Rental Service
In this project there is one WCF Service and One Host for hosting that service
Two Clients : One of Java (Made using JSP and Servlet) and another one of .Net
The service can be consumed by both clients and it is made by keeping in mind Service Oriented Principles

# Basics

WCF stands for Windows Communication Foundation. It is basically used to create a distributed and interoperable Application. WCF Applications came into the picture in .Net 3.0 Framework. This is a framework, which is used for creating Service oriented Applications. You can send the data asynchronously from one end point to another. I think you all know about Web Service and are thinking, if we already have Web Services and accessing on a remote basis then why did WCF come into picture?

There are so many reasons for it but now I am giving you an answer in two words- one is protocol and the other is hosting. Thus, I will explain these two words later in this article.
Distributed Application 

It means those Applications, which do not run only on single system but can run on multiple systems, which are connected over the network. For example, a Web Service that can consume by different clients.

## Interoperable

It means that an Application can consume or connect with another Application but it does not matter in which platform it is developed.

## Example

Web Service is interoperable because it can be consume from any client, either it is from Java or .NET but on a remote basis, it is not interoperable because if we want to consume any remote service from the client, client Application must be developed in .NET.

## Why we need WCF Applications

In this, I am explaining why we need WCF Application, if we already have Web Service.

Suppose, you have two clients- one wants to use a Web Service, which sends data over the network, using Http protocol and want reply in XML format, so we will create a Web Service.

The other wants to send the data, using Web Service over the network, using TCP protocol and replying in binary format, then we need to implement a remote Web service with TCP protocol.

## Problem

The problem is in the example, shown above, we need to create two different Services for two different clients .WCF is solving this problem and one single service can be consumed by two different clients- either they want same protocol or a different protocol. We specify the protocol name in an endpoint attribute of the Web Service.

## WCF

There are three parts of WCF Application or we can say it consists of three things, which are-
WCF Service : What is the service and what it is providing.
WCF Service host: Where is the Service hosted.
Service Client: Who is the client of the Service.
<br/>
## Fundamentals of WCF

## Message

Message is the communication unit, as it is in the form of an envelop. The transmission of the data from the client to Service and Service to client is being done by envelop. The envelop or message has the sections, given below-
Header 
Body
By default Header and fault are disabled but Body is responsible for the data transmission or data exchanging.

Header is useful to send some data from client to Server. Suppose we want to send user name from each request but don’t want to send it by an argument, we can easily add it into message header.

## Endpoint

Endpoint is a very essential part of WCF Application, as it describes the address of Web Service from where a user can receive and send the message. It also specifies the communication mechanism of how the message will be sent or received.

End point consists of three things, which are A,B,C and each of them have a question mark.
Address (Where?)
Binding (how?)
Contract (What?)
Endpoint = A + B+ C

Address is the address of WCF Service, where the Service is hosted? It gives the exact URL of Web Service, where the Service hosts the pattern of URL, which is-

Scheme://domain/[:port]/path
net.tcp://localhost:1234/MyService
http://localhost:1234/MyService

Binding

It describes the way or mechanism by which the user will communicate with Web Service. It constitutes some binding element, which creates the structure of communication such as some transport protocols like HTTP, TCP etc. Message format or security techniques etc.

Contract
 
Contract is the third important question. What functionality and operation is being provided by  the service is called contract. It specifies what functionality and operations are need to be exposed to the client. It is the interface name which has all operation that need to be exposed.

## Hosting

Hosting is the important thing in WCF Application and it makes WCF Application different from other distributed Applications. WCF supports following types of hosting-
IIS Hosting
Self hosting 
WAS hosting

## SOAP

SOAP stands for Simple Object Access Protocol. It is not a transport protocol but an  XML based message protocol.


# Working

WCF : <br/>
Service contract : Icarservice <br/>
Operation contract : getCars(),AddUser(),AddUserCar(),UpdateUSerCar(),DelUserCar [CRUD] <br/>
Data contract : user,car,usercar

CarService.cs : <br/>
Implements Icarservice and has definintions of all the methods.<br/>
.Net local db was used and Disconencted Access was used to manipulate the db.<br/>

Service Endpoints : <br/>
A: "", B: basicHttpBinding, C: Carrental.Icarservice<br/>

Metadata Endpoints : (The Metadata Exchange endpoint is used by the service to describe itself to clients.)<br/>
A: mex, B: mexHttpBinding, C: IMetadataExchange<br/>


