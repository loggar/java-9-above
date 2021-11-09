```
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * introduced: java 9
 * 
 * <pre>
		# compile
		javac
		    --enable-preview # activate preview features
		    --release 12 # release that defines the feature
		    # other flags like --class-path, -d, etc.
		    # list of source files
		# run
		java
		    --enable-preview # activate preview features
		    # other flags like --class-path, etc.
		    # main class
 * </pre>
 */
public class CollectionMethodsPreview {
	public static void main(String[] args) {
		// earlier version:
		List<String> list1 = Arrays.asList("element1", "element2");
		System.out.println(list1);

		// --enable-preview
		List<String> list2 = List.of("element1", "element2");
		System.out.println(list2);

		Set<String> set1 = Set.of("element1", "element2");
		System.out.println(set1);

		Map<String, Object> map1 = Map.ofEntries();
		System.out.println(map1);
	}
}

```

Maven

```xml
<build>
	<plugins>
		<plugin>
			<groupId>org.apache.maven.plugins</groupId>
			<artifactId>maven-compiler-plugin</artifactId>
			<version>3.3</version>
			<configuration>
				<source>${maven.compiler.source.version}</source>
				<target>${maven.compiler.target.version}</target>
				<compilerArgs>--enable-preview</compilerArgs>
			</configuration>
		</plugin>
	</plugins>
</build>
```