package com.example.test0421.user

import android.adservices.adid.AdId
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(user:User)
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insetUsers(users:List<User>)
    @Update
    suspend fun update(user:User)
    @Query("SELECT * FROM users ORDER BY name ASC")
    fun getUser():List<User>
    @Query("SELECT * FROM users WHERE id= :userId")
    fun getUserById(userId: Int):User
    @Query("DELETE FROM users")
    suspend fun deleteAll()
}