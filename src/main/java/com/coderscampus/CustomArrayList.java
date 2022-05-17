package com.coderscampus;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	int capacity = 10;
	Object[] items = new Object[capacity];
	int contentCount = 0;

	public CustomArrayList() {
		items = new Object[capacity];
	}

	@Override
	public boolean add(T item) {
		if (contentCount == items.length) {
			increaseArrayListSize();
		}
		items[contentCount++] = item;
		return true;
	}

	@Override
	public int getSize() {
		return contentCount;
	}

	
	public T get(int index) {
		if (index < contentCount) {
			return (T) items[index];
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	private void increaseArrayListSize() {
		items = Arrays.copyOf(items, items.length * 2);
		capacity = items.length;
	}

	private void decreaseArraySize() {
		contentCount /= 2;
		items = Arrays.copyOf(items, contentCount);
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		get(index);
		if (contentCount == capacity) {
			increaseArrayListSize();
		}
		for (int i = contentCount; i > index; i--) {
			items[i] = items[i - 1];
		}
		items[index] = item;
		contentCount++;
		return true;
	}

	
	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		get(index);
		Object removedElement = items[index];
		for (int i = index; i < contentCount - 1; i++) {
			if (!items[i].equals(index)) {
				items[i] = items[i + 1];
			}
		}
		contentCount--;
		if (capacity > 10 && contentCount < 11) {
			decreaseArraySize();
		}
		return (T) removedElement;
	}
}