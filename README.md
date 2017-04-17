# Masterchef

## Brief Intro
1. What is the proposed name for your Web application?
- Masterchef Recipe
2. Who is the target audience for your Web application?
- People who want to learn how to cook and who love to share homemade gourmet with others. 
3. What problem is it intended to solve for the target audience?
- People can find all kinds of recipes here when they want to learn how to cook. Or when trying to make something different, they can find guidance here. Also, besides looking for recipes, users can share their own fabulous recipes here. Moreover, I added several different sections, such as sharing useful tips, sharing helpful stuff in kitchen, sharing your very own masterpiece and sharing cooking videos. 
4. How will it meet the minimum project requirements?
- All the recipes can be freely glanced. If you want to publish recipes, a login is needed. I'll store user information to database. And I'll store recipes, entries and files uploaded by users in the database. 
5. Why is your proposed Web application unique or creative beyond simply meeting the minimum requirements?
- This is an integrated web site, where users can find all kinds of useful information related to cooking. I can document what you have made and what you have published in the past to show your progress and beautiful memory with food. 


## Build Status
Modify to match your project specific Travis Build
[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web.svg?branch=master)](https://travis-ci.org/infsci2560sp17/full-stack-web-XinyiShu)


## Web Site
[Masterchef Recipe](https://calm-atoll-55406.herokuapp.com/)


## Changelog
[Changelog](https://github.com/infsci2560sp17/full-stack-web-XinyiShu/blob/master/CHANGELOG.md)


## Key Features
* User login
* Add new entries like recipes and tips by users
* Delete existing entries by users
* Update info in existing entries by users
* Different sections
* Upload files to the database by users
* Bootstrap features


## Project Details
TODO: add more detailed screenshots
### Landing Page
There is a welcome page. Users can click "Enter" to jump to login page. After verifying user information, the web will jump to the main page, where users can find out several useful sections. 
<img src="https://github.com/infsci2560sp17/full-stack-web-XinyiShu/blob/master/src/main/resources/welcome.png">

### User Login
This is the login page. Return users can log in while new users can choose to sign up here. 
<img src="https://github.com/infsci2560sp17/full-stack-web-XinyiShu/blob/master/src/main/resources/login.png">

### Main Page
Main page displays the guidance to the whole website and works as a central control. Several bootstrap features are used, such as carousal and modal. 

### Recipe Section
Users can post recipes, delete existing recipes and update recipes. 

### Tip Section
Users can post useful cooking tips here. 

### Good Section
Users can share their favorite culinary tools and product, and the link to buy them. 


### Masterpiece Section
In this section, users can upload pictures and files from their local path to the website. 

## API
TODO : please provide a description of at least 1 API including a sample of request data and response data in both XML and JSON format.
### API Method 1
    POST photos/:id/tags 
#### Parameters
- **id** _(required)_ — The Photo ID to add tags for.
- **tags** _(required)_ — Comma separated tags.
#### Response
A JSON or XMLobject containing the PhotoID and list of tags accepted.
#### Errors
All known errors cause the resource to return HTTP error code header together with a JSON array containing at least 'status' and 'error' keys describing the source of error.
- **404 Not Found** — The photo was not found.
#### Example

##### Request

    POST /v1/photos/123456/tags

##### Body

    tags=cute,puppy


##### JSON Response

```json
{
    "photoId": 123456,
    "tags": ["cute", "puppy"]
}
```

##### XML Response

```xml
<?xml version="1.0" encoding="UTF-8"?>
<PhotoTags>
    <photoId>123456</PhotoId>
        <tags>
            <tag>cute</tag>
            <tag>puppy</tag>
        </tags>
</PhotoTags>
```


## Technologies Used
TODO : List all technologies used in your project
- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.
