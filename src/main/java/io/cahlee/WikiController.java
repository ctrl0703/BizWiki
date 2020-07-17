package io.cahlee;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WikiController {

	@PostMapping("/wiki")
	public void updateWiki(@RequestBody Object request) {
		System.out.println(request);
	}
}
