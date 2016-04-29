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


# Endpoints

## Get all todos

**Request**:

```GET: /todo```

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

**Request**:

```GET: /todo/:title```

**Response**

```
[	
	{
		title: "title",
		id: 1
	}
]
```



## Create a todo

**Request**:

URL
```
POST: /todo
```

Body: 
```
{
	title: "title",
	id: 1
}
```

**Response**

```
[	
	{
		title: "title",
		id: 1
	}
]
```