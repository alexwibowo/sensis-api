package org.isolution.sensis.net;

import java.io.IOException;

import org.isolution.sensis.cfg.FileBasedSensisApiConfiguration;
import org.isolution.sensis.domain.SearchResult;
import org.junit.Test;

public class SensisApiSearchServiceIntegrationTest {

	@Test
	public void test_search() throws IOException {
		SensisApiSearchService sensisApiSearchService = new SensisApiSearchService(
			new FileBasedSensisApiConfiguration());
		SearchResult cafe = sensisApiSearchService.search(
				"car repairer", "east bentleigh");
		System.out.println(cafe.getCount());
	}
}
