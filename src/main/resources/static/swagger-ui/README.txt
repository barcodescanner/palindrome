This code comes from https://github.com/swagger-api/swagger-ui/, specifically the dist directory.
Currently, the only local modification is in index.html, line 47. Here, the Swagger JSON used by the UI comes from a
custom location specified on the URL in a query param. Since all Connex Local Agent controllers will serve their Swagger JSON from the
same URI, we mostly hard-code it. When updating, remember to change:

	url: url,

to

	url: window.location.origin + "/v2/api-docs",

It's easiest to keep a local git clone of https://github.com/swagger-api/swagger-ui.git, then copy/paste the files in
swagger-ui/dist to connex-commons/connex-web-commons/src/main/resources/swagger-ui (this directory).