/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aish.vaishno.musicstore.dao;

import aish.vaishno.musicstore.pojo.MusicDetails;
import java.util.List;

/**
 *
 * @author Aishu
 */
public interface IMusicStoreDao {
    
    public String addSong(MusicDetails musicDetails);
    public List<MusicDetails> getSongList();
      
}
