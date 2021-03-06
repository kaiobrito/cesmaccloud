# cesmaccloud

[![Build Status](https://travis-ci.org/kaiobrito/cesmaccloud.svg?branch=master)](https://travis-ci.org/kaiobrito/cesmaccloud)

How to generate bundle.zip used on AWS Elastic Beanstalk:

```
jar cMf bundle.zip src conf Procfile Buildfile pom.xml

```


## Eclipse configuration

In the root path of the project use the follows commands :

```
mvn eclipse:clean
mvn eclipse:eclipse
```

## How to test endpoints

You can import a collection on Postman [here](https://www.getpostman.com/collections/1c595565ab9d4e6acf2d).



# Endpoints

## Get all todos

### Request:

**URL:**

```
GET: /todo
```

**Response**

```
[
	{
		title: "title",
		id: 1
	},
	{
		title: "title 2",
		id: 2
	}
]
```

## Get a todo

### Request:

**URL:**

```
GET: /todo/:id
```

**Response:**

```
{
	title: "title",
	id: 1
}
```


## Create a todo

### Request:

**URL:**

```
POST: /todo
```

**Body:**

```
{
	title: "title"
}
```

**Response:**

```
{
	title: "title",
	id: 1
}
```

## Update a todo

### Request:

**URL:**

```
PUT: /todo/:id
```

**Response**

```
{
	title: "title2",
	id: 2
}
```
