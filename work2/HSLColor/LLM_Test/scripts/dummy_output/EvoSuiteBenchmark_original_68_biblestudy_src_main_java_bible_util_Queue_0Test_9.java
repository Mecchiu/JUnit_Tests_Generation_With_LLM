// Queue_0Test.java
package bible.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Queue}.
* It contains one unit test case for the {@link Queue#dequeue()} method.
*/
class Queue_0Test {
		/**
		 * The variable that contains the max number of items
		 * the queue can hold.
		 */
        public static String maxNumItems = "Max number of items!";

        /**    
         * The ArrayList containing all the nodes from the queue.
         */
        public static ArrayList<Node> data = new ArrayList<>();

        /**
		 * Test method for {@link Queue#enqueue(Object)}.
		 * The method tests that we are able to enqueue an Object in the queue.
		 */
		@Test
		public void testEnQueue() {
						//First we have all objects
						while(data.size() < 1000) {
                            	data.add(null); //Add a null in case of empty queue
                                    	//Create a Node Object first and add it to our data
                            	Node temp = new Node();
                            	data.add(temp);
                        }

                        //Next we get the number of items in the Queue
                        long numberOfItems = dequeue().length();

                        //Create an empty Queue
                        Queue tempQueue = new Queue();

                        //Ensure the Queue contains no objects
                        assertTrue("Queue was not empty!",
                                    tempQueue.isEmpty());

                        //Create a new Queue from the queue.  It allows us to set
                        //it's max number-of items
                        Queue tempQueue2 = new Queue(numberOfItems);

						//Ensure we get the Object we need
                        Object temp = tempQueue2.dequeue();

						//If the Object we want was in the Queue
						if (temp!= null) {
						//Create a temporary Thread
							Thread tempThread = new Thread(null, "TEMPORARY-THREAD-" + temp.hashCode());
							tempThread.start();

							//Add a temporary Thread to queue, which allows us to set
							//the element we want
								dequeue();

							//Add a new thread to the list.
							dequeue();

							//Finally create and put a temporary Thread
							Thread tempThread2 = new Thread(null, "TEMPORARY-THREAD-2-" + temp.hashCode() + ":" + numberOfItems);
							tempThread2.start();	  //TODO: Is this thread still started?

                            	//wait until tempQueue2 is empty
                            	tempThread2.join();

							//Now we can get the object we want back.  The object is the first in the
							//linked list
							Object nextNode = tempQueue2.dequeue();

							//Check if temp.hashCode() corresponds to the first node in linked list
							assertTrue("First node found of Queue", nextNode.hashCode() == numberOfItems);	

                            	//Now we can remove the tempQueue2 from the linked list
							dequeue();
                                    }

		        }
		}
	
		/**
		 * Class where we can test the maximum number of items for a
		 * queue.  The maximum number is 5 - 10.  In order to test
		 * the maximum number we have to create a Queue object using
		 * different objects since the Queue object stores all the
		 * objects.
		 */
		public static class Queue {

                	/**
                     * The first node in the queue
                     */
        	    public Node first = null;

               	 /**
                      * The last node in the queue
                 	 */
        	    public Node last = null;

               	 /**
                     * The number of items in this queue
                     */
                	public int numItems;

        	    public Queue(int _numItems) {
                            	numItems = _numItems;
                        }

                        public boolean isEmpty() {
                                return numItems == 0;
                        }

                        public boolean maxCapacityExceeded() {
                                //if (maxNumItems < numItems) then return maxNumItems == numItems
                                if (numItems > maxNumItems) {
                                        return true;
                                } else {
                                        return false;
                                }
                        }
}