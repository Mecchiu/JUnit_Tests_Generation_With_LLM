// ArrayOfJobTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfJob}.
* It contains one unit test case for the {@link ArrayOfJob#getTypeDesc()} method.
*/
class ArrayOfJobTest {
		
	/**
	 * run method of {@link ArrayOfJob}.
	 */
	@Test
	public void run() {

		ArrayOfJob job = new ArrayOfJob();

		String type= null;
		
        //set an array of jobs
        ArrayOfJob.setTypeDesc(type);
        
        //call run method of the ArrayOfJob class.
        job.run();
        
        System.out.println(job.getTypeDesc());
        
        org.apache.axis.message.addressing.EndpointReferenceType _endpoint = new org.apache.axis.message.addressing.EndpointReferenceType();
		
		//Set the endpoint (should get null). 
		//EndpointReferenceType ref = new EndpointReferenceType();
		//ref.setAddress("127.0.0.1:8005");
		//_endpoint.setAddress(_endpoint);
		//System.out.println("getEndpointRefFromString:"+ref.getAddress());
		//ref.setReferenceId(12345);
		//_endpoint.setReferenceId(ref);
		//_endpoint.setScope(org.apache.axis.namespace.QName.NO_NAMESPACE);
		//_endpoint.setTransportMode(org.apache.axis.transport.tcp.TcpConstants.TRANSPORT_SSL);
    
    
        //The following tests make sure that you can connect to a JMS endpoint using a secured JMS
        //connection. The default JMS connection type is secured (as defined by the JMSJMSClientConnectionFactory)
        //and therefor the JMSDestination defined to connect to is secured with SSL.
    
        //Define an address and port. Each of these parameters takes a valid value.
        //address = {"jms.rabbitmq.fhs.co.uk":"5672"},
        // address = {"jms.rabbitmq.fhs.co.uk":"5672", "jms.rabbitmq.fhs.co.uk": "5672"};
        //destination = {"jms.rabbitmq.fhs.co.uk":"5672"};
        _endpoint.setAddress("jms.rabbitmq.fhs.co.uk:15672");
		
		// Set the transport. There can be no transport.
		_endpoint.setTransportMode(org.apache.axis.transport.tcp.TcpConstants.TRANSPORT_SSL);
        
        /*
        // Set your application name
        _endpoint.setApplicationName("MyBPM");
        //Set your BPM Application name
        _endpoint.setName("MyBPM");
        */
        // Add one of the JMS message types used with this endpoint.
        _endpoint.setType(org.apache.axis.enums.XMLMessagesType.MESSAGE);
        
        // Create the connection
        // org.apache.camel.component.jms.JmsMessageConverter jms = new CamelJmsMessageConverter(); //create an instance of JmsMessageConverter and convert using a single connection
        // jms.getConnectionContext().setConfiguredDestination("jms.rabbitmq.fhs.co.uk:15672");
   
        
        // Set this connection as the connection factory. 
        // If a connection is not supplied it will use a default connection created using a connection factory (from a set of factories).
        org.apache.camel.component.jms.ConnectionFactoryRegistry connectionFactoryRegistry = org.apache.camel.bam.testutil.connectionFactoryRegistry;
        //org.apache.camel.bam.testutil.ConnectionFactoryRegistryFactoryBean jms = new ConnectionFactoryRegistryFactoryBean(connectionFactoryRegistry,
        //  new ConnectionFactoryProxy.ProxyImplJmsImpl("jms.rabbitmq.fhs.co.uk:15672", true), true);
        //connectionFactoryRegistry = jms.getConnectionFactoryRegistry();
        // Set another factory which returns an instance of a ConnectionFactory (the one we want to set), so that we can use JmsMessageConverter and JmsFourierConnectionFactory to convert. 
        connectionFactoryRegistry.setConnectionFactoryClass(org.apache.camel.bam.connectionfactory.ConnectionFactoryProxy.ProxyImplJmsImpl.class);
      
	}
}