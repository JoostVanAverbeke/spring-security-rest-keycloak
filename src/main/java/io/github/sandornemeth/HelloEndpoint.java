package io.github.sandornemeth;

import java.security.Principal;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * External gateway.
 *
 * @author Sandor Nemeth <sandor.nemeth.1986@gmail.com>
 */
@RestController
public class HelloEndpoint {

    private final AtomicLong counter = new AtomicLong();

    @Secured("ROLE_ADMIN")
    @GetMapping("/admin/hello")
    public Greeting sayHelloToAdmin(final Principal principal) {
		return new Greeting(counter.incrementAndGet(), 
				String.format("Hello Admin, %s!", principal.getName()));    	
    }

    @Secured("ROLE_USER")
    @GetMapping("/user/hello")
    public Greeting sayHelloToUser(final Principal principal) {
		return new Greeting(counter.incrementAndGet(), 
				String.format("Hello User, %s!", principal.getName()));    	
    }

    @GetMapping("/guest/hello")
    public Greeting sayHelloToGuest() {
		return new Greeting(counter.incrementAndGet(), 
				String.format("Hello Guest, %s", "unknown guest"));    	
    }
}
