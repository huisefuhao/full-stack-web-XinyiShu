# Masterchef

## Brief intro
1. What is the proposed name for your Web application?
Masterchef Recipe
2. Who is the target audience for your Web application?
People who want to learn how to cook and who love to share homemade gourmet with others. 
3. What problem is it intended to solve for the target audience?
People can find all kinds of recipes here when they want to learn how to cook. Or when trying to make something different, they can find guidance here. Also, besides looking for recipes, users can share their own fabulous recipes here. Moreover, I added several different sections, such as sharing useful tips, sharing helpful stuff in kitchen, sharing your very own masterpiece and sharing cooking videos. 
4. How will it meet the minimum project requirements?
All the recipes can be freely glanced. If you want to publish recipes, a login is needed. I'll store user information to database. And I'll store recipes, entries and files uploaded by users in the database. 
5. Why is your proposed Web application unique or creative beyond simply meeting the minimum requirements?
This is an integrated web site, where users can find all kinds of useful information related to cooking. I can document what you have made and what you have published in the past to show your progress and beautiful memory with food. 

## Build status

Modify to match your project specific Travis Build
[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web.svg?branch=master)](https://travis-ci.org/infsci2560sp17/full-stack-web-XinyiShu)

## Web Site

[Masterchef Recipe](https://calm-atoll-55406.herokuapp.com/)

## Changelog

[Changelog](https://github.com/infsci2560sp17/full-stack-web-XinyiShu/blob/master/CHANGELOG.md)
## Key Features

TODO : Please list key features of your project.

* User login
* Add recipes by users
* Key Feature N

## Project Details

### Landing Page

There is a welcome page. Users can click "find a recipe" to jump to login page. After verifying user information, the web will jump to my main page, recipe, where users can add new recipes. 

<img src="https://github.com/infsci2560sp17/full-stack-web-XinyiShu/blob/master/src/main/resources/welcome.png">

### User Input Form

Users can add their own recipes by entering recipe titles and choosing a category of this dish. When the editing is done, user can upload their recipes to databse and recipes will be displayed on the table above. 

<img src="https://github.com/infsci2560sp17/full-stack-web-XinyiShu/blob/master/src/main/resources/inputform.png">

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
