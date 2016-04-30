# cesmaccloud

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

You can import a collection on Postman [here](https://www.getpostman.com/collections/d4ee5b4f401a78ef557c).


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
GET: /todo/:title
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
