import pymongo

client = pymongo.MongoClient("mongodb+srv://abbyFarnsSnhu:*****@cluster0.j7wyx.mongodb.net/"
                             "test?authSource=admin&replicaSet=atlas-brg50u-shard-0&readPreference="
                             "primary&appname=MongoDB%20Compass&ssl=true")

# Database Name
db = client["airbnbReviews"]

# Collection Name
col = db["listingsAndReviews"]

#find a random listing
listing = col.find({}, {'_id': 1, 'name': 1,
'summary': 1, 'space': 1, 'neighborhood_overview': 1,
'notes': 0, 'transit': 0, 'access': 1, 'interaction': 1,
'house_rules': 0, 'property_type': 1, 'room_type': 0,
'bed_type': 0, 'minimum_nights': 1, 'maximum_nights': 0,
'cancellation_policy': 1,'first_review': 0,
'last_review': 1, 'accommodates': 0, 'bedrooms': 0,
'beds': 0})

#print out listing data
for data in listing:
    print(data)

#create a new database entry
#connect to database
db = conn.airbnbReviews

#switch to collection
collection = db.listingsAndReviews

#fill out new entry fields
newListing = {
    '_id': 10007799,
    'name': 'London flat with balcony garden',
    'summary': 'beautiful modern flat in Camden',
    'space': 'views of the Thomsington square',
    'neighborhood_overview': 'one block away from farmers market',
    'notes': 'sit back and relax in the luxurious living area',
    'transit': 'one block from tube',
    'access': '24/7 assistance',
    'interaction': 'dogs allowed',
    'house_rules': 'make yourself at home',
    'property_type': 'flat',
    'room_type': 'entire flat',
    'bed_type': 'real bed',
    'minimum_nights': 1,
    'maximum_nights': 15,
    'cancellation_policy': 'one week in advance',
    'first_review': 'September 19, 2010',
    'last_review': 'March 30, 2021',
    'accomodates': 3,
    'bedrooms': 2,
    'beds': 3
}

# Insert Data
newListing_10007799 = listingAndReviews.insert_one(newListing)

print("Data inserted with record ids",newListing_10007799 , " ", newListing)

# Printing the data inserted
cursor = listingsAndReviews.find()
for record in cursor:
    print(record)

#updating a record
#connect to database
db = conn.airbnbReviews

#switch to collection
collection = db.listingsAndReviews

# update listing field
result = listingsAndReviews.update_one(
    {'_id': 10007799},
    {
        "$set": {
            "minimum_nights": 2
        },
        "$currentDate": {"lastModified": True}

    }
)

print("Data updated by listing id", result)

# Print the new record
cursor = listingsAndReviews.find()
for record in cursor:
    print(record)