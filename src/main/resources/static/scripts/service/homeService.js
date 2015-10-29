angular.module('aplikasiSpringboot')
        .factory('homeService', function ($http){
            return {
                getBuah: function (){
                    return $http.get("/buah");
                },
                getListBuah: function (){
                    return $http.get("/ListBuah");
                },
                getBuahFromDb:function (data){
                    return $http.get("/api/buah");
                },
                save: function (data) {
                    return $http.post("/api/buah", data);
                },
                delete: function (id){
                    return $http.delete("api/buah/"+id);
                },
                update: function (id,data){
                    return $http.put("api/buah/"+id,data);
                }
            };
});