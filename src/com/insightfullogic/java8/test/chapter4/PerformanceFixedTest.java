package com.insightfullogic.java8.test.chapter4;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;

// http://www.vogella.com/tutorials/Hamcrest/article.html
// 上面网址提供Hamcrest解决与Junit冲突的办法
// http://search.maven.org/#search|ga|1|g%3Aorg.hamcrest
// 上面网址提供hamcrest的相关文件下载路径
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

import com.insightfullogic.java8.answers.chapter4.PerformanceFixed;
import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.examples.chapter1.SampleData;

public class PerformanceFixedTest {

	@Test
	public void testGetAllMusicians() {

		PerformanceFixed stub = new PerformanceFixed() {

			@Override
			public String getName() {
				throw new UnsupportedOperationException();
			}

			@Override
			public Stream<Artist> getMusicians() {
				return Stream.of(SampleData.theBeatles);
			}
		};
		
		List<Artist> allMusicians=stub.getAllMusicians().collect(Collectors.toList());
		
		// 后续使用更好的测试方法,比如将theBeatles与membersOfTheBeatles通过lambda结合成List
		assertThat(allMusicians, hasItem(SampleData.theBeatles));
		assertThat(allMusicians, hasItems(SampleData.membersOfTheBeatles.toArray(new Artist[0])));
	}

}
