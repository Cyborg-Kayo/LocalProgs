import pymongo
ConnectionString="mongodb+srv://VishnuJodd:Vishnu03@cluster0.nulxsv1.mongodb.net/"


def writing():
    C.insert_one({"name":"steve","Character":"One","Age":11})
    # C.insert_many([{"name":"steve","Character":"Two","Age":16},
    #                {"name":"Dustin","Character":"Three","Age":13}]
    #             )
    
def finding():
    # x=C.find({"name":"steve"})
    # for i in x:
    #     print(i)
    s=C.find().sort("name")
    
    for i in s:
        print(i)
        
def updating():
    C.update_one({"name":"Dustin"},{"$set":{"Age":14}})

if __name__=="__main__":
    client1=pymongo.MongoClient(ConnectionString)
    Db2=client1.Collection2
    C=Db2.posts2
    
    # writing()
    finding()
    # updating()
    
    
