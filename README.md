# ELS-APP
Simple Spring Boot Appliacation with Spring Data ElasticSearch

## Configure ElasticSearch Indices
To create an index in ElasticSearch using Kibana DevTool
```
PUT /documents-000001
{
  "aliases": {
    "documents": {}
  },
  "mappings": {
    "key-doc": {
      "properties": {
        "key": { "type": "keyword" },
        "value": { "type": "keyword" }
      }
    }
  }
}
```

To rollover index using some cronJob:
```
POST /documents/_rollover
{
  "conditions": {
    "max_age":   "7d",
    "max_docs":  5
  }
}
```