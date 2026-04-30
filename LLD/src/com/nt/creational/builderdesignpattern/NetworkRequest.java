package com.nt.creational.builderdesignpattern;

public class NetworkRequest {
	// 1. Immutable Fields (Private & Final)
	private final String url; // Mandatory
	private final String method; // Mandatory
	private final String body; // Optional
	private final int timeout; // Optional
	private final boolean useCache; // Optional

	// 2. Private Constructor: Only accessible by the Inner Builder
	private NetworkRequest(Builder builder) {
		this.url = builder.url;
		this.method = builder.method;
		this.body = builder.body;
		this.timeout = builder.timeout;
		this.useCache = builder.useCache;
	}

	// 3. The Static Inner Builder Class
	public static class Builder {
		private String url;
		private String method = "GET"; // Default value
		private String body;
		private int timeout = 5000; // Default value
		private boolean useCache = true;

		// Methods for setting values (The Fluent Interface)
		public Builder url(String url) {
			this.url = url;
			return this;
		}

		public Builder method(String method) {
			this.method = method;
			return this;
		}

		public Builder body(String body) {
			this.body = body;
			return this;
		}

		public Builder timeout(int timeout) {
			this.timeout = timeout;
			return this;
		}

		public Builder useCache(boolean useCache) {
			this.useCache = useCache;
			return this;
		}

		// 4. The Build Method: Assembles and Validates the final object
		public NetworkRequest build() {
			if (url == null || url.isEmpty()) {
				throw new IllegalStateException("URL cannot be null or empty");
			}
			return new NetworkRequest(this);
		}

		// Getters only - No Setters!
		public String getUrl() {
			return url;
		}

		public String getMethod() {
			return method;
		}

		public String getBody() {
			return body;
		}

		public int getTimeout() {
			return timeout;
		}

		public boolean isUseCache() {
			return useCache;
		}

		@Override
		public String toString() {
			return "Request: " + method + " " + url + " [Timeout: " + timeout + "ms]";
		}
	}

	@Override
	public String toString() {
		return "NetworkRequest [url=" + url + ", method=" + method + ", body=" + body + ", timeout=" + timeout
				+ ", useCache=" + useCache + "]";
	}

}