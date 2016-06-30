package test.com.insightfullogic.java8.exercises.chapter2;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import com.insightfullogic.java8.exercises.chapter2.Question2;

public class Question2Test {

	@Test
	public void test() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 1970);
		calendar.set(Calendar.MONTH, Calendar.JANUARY);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		String formatted = Question2.formatter.get().format(new Date(0));
		assertEquals("70-1-1 ионГ8:00", formatted);
	}

}
