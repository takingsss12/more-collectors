package morecollectors.collectors;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;

interface UnorderedCollector<T, A, R> extends Collector<T, A, R>
{
	@Override
	default Set<Characteristics> characteristics()
	{
		return Collections.unmodifiableSet(new HashSet<>(Arrays.asList(Characteristics.UNORDERED)));
	}
}
