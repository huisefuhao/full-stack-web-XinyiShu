# Masterchef

## Brief intro
1. What is the proposed name for your Web application?
Masterchef
2. Who is the target audience for your Web application?
People who want to learn how to cook and who enjoy homemade gourmet food. 
3. What problem is it intended to solve for the target audience?
There will be a short survey to recommend recipes according to users' preference, aside from a simple search column. If you know what you're looking for, use the search column. If you haven't made up your mind and are looking for suggestions, the website can present recommendations based on the style, diners and degree of difficulty that you choose. And then you can add ingredients to your checklist and start to cook your own food. On the other hand, users can also make and share their own recipes by uploading procedures and pictures. 
4. How will it meet the minimum project requirements?
All the recipes can be freely glanced. If you want to use favorite and checklist or publish recipes, a login is needed. I'll store user information and favorites to database and push related contents according to users' preference. 
5. Why is your proposed Web application unique or creative beyond simply meeting the minimum requirements?
Deciding what to cook and eat can be time-consuming sometimes. By using a short survey of what you want right now, you can save time of aimless browsing. The most suitable recipe for the moment will be presented after a few clicks. Also, a checklist of ingredients is very useful. Moreover, I can document what you have made and what you have published in the past to show your progress and beautiful memory with food. 

## Build status

Modify to match your project specific Travis Build
[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web.svg?branch=master)](https://travis-ci.org/infsci2560sp17/full-stack-web-XinyiShu)

## Web Site

[My website](https://protected-forest-53329.herokuapp.com/)

## Changelog

[Changelog](https://github.com/infsci2560sp17/full-stack-web-XinyiShu/blob/master/CHANGELOG.md)

## Key Features

TODO : Please list key features of your project.

* Key Feature 1
* Key Feature 2
* Key Feature N

## Project Details

### Landing Page

TODO : please provide a description of your landing page inluding a screen shot ![](https://.../image.JPG)

### User Input Form

TODO : please provide a description of at least 1 user input form including a screen shot ![](https://.../image.jpg)

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
