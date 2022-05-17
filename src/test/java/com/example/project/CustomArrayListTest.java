package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.coderscampus.CustomArrayList;
import com.coderscampus.CustomList;

public class CustomArrayListTest {
	// Step 1 - Write a failing part
		// Step 2 - Write the business logic to make the test pass
		// Step 3 - Refactor the code
		// Step 4 - Repeat
		// Arrange
		// Act
		// Assert
		@Test
		void should_add_one_item_() {
			// Arrange
			CustomList<Integer> sut = new CustomArrayList<>();
			// Act
			sut.add(10);
			Integer expectedResult = sut.get(0);
			Integer expectedSize = sut.getSize();
			// Assert
			assertEquals(10, expectedResult);
			assertEquals(1, expectedSize);
		}
		@Test
		void should_add_100_items_() {
			CustomList<Integer> sut = new CustomArrayList<Integer>();
			for (int i = 1; i < 101; i++) {
				sut.add(i);
			}
			for (int i = 0; i < 100; i++) {
				assertEquals(i + 1, sut.get(i));
			}
			assertEquals(100, sut.getSize());
		}
		@Test
		void should_increase_size_limit() {
			CustomArrayList<Integer> sut = new CustomArrayList<>();
			for (int i = 0; i < 20; i++) {
				sut.add(i);
			}
			assertEquals(20, sut.getSize());
		}
		@Test
		void should_throw_index_out_of_bounds_exception() {
			CustomList<Integer> sut = new CustomArrayList<Integer>();
			assertThrows(IndexOutOfBoundsException.class, () -> sut.add(15, 1));
		}
		@Test
		void should_get_index_() {
			CustomList<Integer> sut = new CustomArrayList<>();
			for (int i = 0; i < 15; i++) {
				sut.add(i);
			}
			Integer expectedIndex = sut.get(12);
			assertEquals(12, expectedIndex);
		}
		@Test
		void should_throw_out_of_bounds_exception() {
			CustomList<Integer> sut = new CustomArrayList<>();
			for (int i = 0; i < 15; i++) {
				sut.add(i);
			}
			assertThrows(IndexOutOfBoundsException.class, () -> sut.add(25, 1));
		}
		@Test
		void should_remove_() {
			CustomList<Integer> sut = new CustomArrayList<>();
			sut.add(1);
			sut.add(2);
			sut.add(3);
			sut.add(4);
			sut.add(5);
			sut.add(6);
			sut.add(7);
			sut.add(8);
			sut.remove(0);
			Integer expectedResult = sut.get(5);
			assertEquals(7, expectedResult);
		}
		@Test
		void should_throw_out_of_bounds_exception_if_out_of_array() {
			CustomList<Integer> sut = new CustomArrayList<>();
			sut.add(1);
			sut.add(2);
			sut.add(3);
			sut.add(4);
			sut.add(5);
			sut.add(6);
			sut.add(7);
			sut.add(8);
			assertThrows(IndexOutOfBoundsException.class, () -> sut.remove(100));
		}
	}

	

