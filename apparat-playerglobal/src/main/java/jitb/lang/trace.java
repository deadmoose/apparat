package jitb.lang;

/**
 * @author Joa Ebert
 */
public class trace {
	public static Object callStatic(Object... args) {
		final StringBuilder builder = new StringBuilder();
		final int n = args.length;
		final int m = n - 1;

		for(int i = 0; i < n; ++i) {
			builder.append(args[i].toString());
			if(i != m) {
				builder.append(" ");
			}
		}

		System.out.println(builder.toString());
		return null;
	}
}