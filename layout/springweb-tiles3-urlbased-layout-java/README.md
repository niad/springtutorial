SpringMVC4 + tiles3 (urlbased) + javaconfig
----

##장점
template 변경시 tiles 설정에서 url 패턴별로 변경할 수 있다.
각 HTML에는 html에서 body 내에 포함될 태그만 사용한다.  
자료가 많다.

##단점
url path를 viewname 검색시 사용
url과 viewname이 연관관계가 있어 파일명 생성 규칙이 반드시 필요

RESTful URL 설계시 URL과 view filename 규칙 맞추기가 비교적 어려움

tiles-layout.xml 설정파일은 JavaConfig 설정이 어렵다.

