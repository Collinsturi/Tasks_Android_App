package com.rsk.tasks

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface TaskDao {
    @Insert
    suspend fun insert(task: Tasks)

    @Update
    suspend fun update(task: Tasks)

    @Delete
    suspend fun delete(task: Tasks)

//    @Query("SELECT * FROM task_table WHERE taskId = taskId")
//     fun  get(taskId:  Long): LiveData<Tasks>

    @Query("SELECT * FROM task_table ORDER BY taskId DESC")
     fun getAll(): LiveData<Tasks>

}