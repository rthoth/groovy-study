public class Emitter {
	public static interface Listener {
		public void execute(String str);
	}

	public Emitter setListener (Listener listener) {
		if (listener != null)
			listener.execute("I'm a Emitter loser!");

		return this;
	}
}