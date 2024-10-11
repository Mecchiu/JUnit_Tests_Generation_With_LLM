// ProcessorTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Processor}.
* It contains ten unit test cases for the {@link Processor#getTypeDesc()} method.
*/
class ProcessorTest {

	/**
	* Test case for {@link Processor#getTypeDesc()} method.
	* It tests the method with the following assertions:
	* <ul>
	* 	<li>The method returns a non-null value.</li>
	* </ul>
	*/
	@Test
	void testGetTypeDesc() {
		assertNotNull(Processor.getTypeDesc());
	}
}
```

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc