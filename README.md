# security
setup instruction 
1 clone code from git
2 run sql_scrip on mySql
2 import maven project in to IDE (eclipse...)
3 run project as spring boot app

4 please signup via URL http://localhost:8080/api/auth/signup firt
json submit example: please set role as "admin"/"mod"/"user"
{
    "username":"diep",
    "email":"diepngx@gamil.com",
    "role":["mod"],
    "password":"123456"
}

5 signin via URL http://localhost:8080/api/auth/signin
json submit example: use username, passworf signup above
{
	"username":"diep1",
    "password":"1234567"
}

API list_places URL http://localhost:8080/api/places/
headers : please submit token get from signin API 
Authorization: token_typpe accessToken
example
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJkaWVwIiwiaWF0IjoxNjI0MDk3MzQ0LCJleHAiOjE2MjQxODM3NDR9.FThqm7D6pk3gZ-1_mmkxtUypcIiInVNEnM6JgOEivYypcCAZ8bJ4rLai9mjK5MH0edAfJbNtAQI_j_wEat1XHQ
